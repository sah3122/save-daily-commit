package me.study.savedailycommit.service;

import lombok.RequiredArgsConstructor;
import me.study.savedailycommit.domain.DailyCommitAccount;
import me.study.savedailycommit.repository.DailyCommitRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DailyCommitService {

    private final DailyCommitRepository dailyCommitRepository;

    public DailyCommitAccount save(DailyCommitAccount dailyCommitAccount) {
        DailyCommitAccount savedDailyCommitAccount = dailyCommitRepository.save(dailyCommitAccount);
        return savedDailyCommitAccount;
    }

}
