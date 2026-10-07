package com.rho.rag.service;


import com.rho.rag.record.Answer;
import com.rho.rag.record.Question;
import org.springframework.stereotype.Service;

@Service
public interface BoardGameService {
    Answer askQuestion(Question question);
}
