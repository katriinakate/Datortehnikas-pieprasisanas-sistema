package com.websystem.datortehnika.service;

import com.websystem.datortehnika.model.Pieprasijumi;

import java.util.List;

public interface PieprasijumiService {
    public Pieprasijumi savePieprasijumi (Pieprasijumi pieprasijumi);
    public List<Pieprasijumi> getAllPieprasijumi();
}
