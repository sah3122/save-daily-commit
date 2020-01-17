package me.study.savedailycommit.repository;

import me.study.savedailycommit.domain.DailyCommitAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DailyCommitRepository extends JpaRepository<DailyCommitAccount, Long> {
}
