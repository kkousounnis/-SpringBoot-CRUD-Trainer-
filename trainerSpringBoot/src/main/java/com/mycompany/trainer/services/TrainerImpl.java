/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainer.services;

import com.mycompany.trainer.dao.TrainerDaoImpl;
import com.mycompany.trainer.entities.Trainer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("trainerService")
@Transactional
public class TrainerImpl implements ITrainer {

    @Autowired
    TrainerDaoImpl dao;

    @Override
    public List<Trainer> findAllTrainers() {
        List<Trainer> trainers = dao.findAllTrainers();
        return trainers;
    }

    public boolean save(Trainer trainer) {
        return dao.save(trainer);
    }

    public boolean delete(int id) {
        return dao.delete(id);
    }

    public boolean update(Trainer student) {
        student.setFirstName(convertTextToUpper(student.getFirstName()));
        student.setLastName(convertTextToUpper(student.getLastName()));
        dao.update(student);
        return true;
    }
    
    public Trainer findById(int id) {
        return dao.findById(id);
    }
    
    protected String convertTextToUpper(String text) {
        return text.toUpperCase();
    }

}
