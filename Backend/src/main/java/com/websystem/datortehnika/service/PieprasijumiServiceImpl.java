package com.websystem.datortehnika.service;

import com.websystem.datortehnika.model.Pieprasijumi;
import com.websystem.datortehnika.repository.PieprasijumiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PieprasijumiServiceImpl implements PieprasijumiService{

    @Autowired
    private PieprasijumiRepository pieprasijumiRepository;

    @Override
    public Pieprasijumi savePieprasijumi(Pieprasijumi pieprasijumi) {
        return pieprasijumiRepository.save(pieprasijumi);
    }

    @Override
    public List<Pieprasijumi> getAllPieprasijumi() {
        return pieprasijumiRepository.findAll();
    }
}
