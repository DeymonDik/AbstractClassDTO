package org.example.Service;

import org.example.Model.AnimalAbstractClass;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    public ResponseEntity<AnimalAbstractClass> send(AnimalAbstractClass request) {

        request.setSay(null);
        return new ResponseEntity<>(request, HttpStatus.OK);

    }

}
