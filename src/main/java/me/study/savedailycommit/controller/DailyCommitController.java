package me.study.savedailycommit.controller;

import lombok.RequiredArgsConstructor;
import me.study.savedailycommit.domain.DailyCommitAccount;
import me.study.savedailycommit.service.DailyCommitService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class DailyCommitController {

    private final DailyCommitService dailyCommitService;

    @PostMapping
    public ResponseEntity saveDailyCommit(@RequestBody DailyCommitAccount dailyCommitAccount) {
        DailyCommitAccount savedDailyCommitAccount = dailyCommitService.save(dailyCommitAccount);
        return new ResponseEntity(savedDailyCommitAccount, HttpStatus.CREATED);
    }
}
