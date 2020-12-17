/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainer.dao;

import com.mycompany.trainer.entities.Trainer;
import java.util.List;
import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

@Repository("trainerDao")
public class TrainerDaoImpl extends AbstractDao<Integer, Trainer> implements ITrainerDao{

    @Override
    public List<Trainer> findAllTrainers() {
        Criteria criteria = createEntityCriteria();
	return (List<Trainer>) criteria.list();
    }

    @Override
    public Trainer findById(int id) {
        Trainer t = getByKey(id);
        if(t != null) {
            return (t);
        }
        return null;
    }

    @Override
    public boolean save(Trainer trainer) {
        boolean notSaved = persist(trainer);
        if(notSaved) return false;
        return true;
    }

    @Override
    public boolean delete(int id) {
        Trainer t = getByKey(id);
        if(t != null) {
            delete(t);
            if(getByKey(id) == null) 
                return true;
        }
        return false;
    }

    @Override
    public boolean update(Trainer trainer) {
        Trainer db_trainer = findById(trainer.getId());
        if(db_trainer != null) {
            db_trainer.setFirstName(trainer.getFirstName());
            db_trainer.setLastName(trainer.getLastName());
            db_trainer.setSubject(trainer.getSubject());
            return save(db_trainer);
        } else
            return false;
    }
    
}
