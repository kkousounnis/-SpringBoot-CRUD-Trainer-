/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainer.services;

import com.mycompany.trainer.entities.Trainer;
import java.util.List;

/**
 *
 * @author konstantinos
 */
public interface ITrainer {
    public List<Trainer> findAllTrainers();
    public Trainer findById(int id);
    public boolean save(Trainer trainer);
    public boolean delete(int id);
    public boolean update(Trainer student);
}
