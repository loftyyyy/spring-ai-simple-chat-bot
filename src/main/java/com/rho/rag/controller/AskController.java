package com.rho.rag.controller;

import com.rho.rag.record.Answer;
import com.rho.rag.record.Question;
import com.rho.rag.service.BoardGameService;
import com.rho.rag.service.SpringAiBoardGameService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AskController {

    private final BoardGameService boardGameService;

    public AskController(BoardGameService boardGameService){
        this.boardGameService = boardGameService;
    }

    @PostMapping(path = "/ask", produces = "application/json")
    public Answer ask(@RequestBody Question question){
        return boardGameService.askQuestion(question);
    }
}
