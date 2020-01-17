package me.study.savedailycommit.domain;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class DailyCommitAccount {
    @Id @GeneratedValue
    private Long id;

    private String email;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "DailyType", joinColumns = @JoinColumn(name = "id"))
    @Enumerated(EnumType.STRING)
    private List<DailyType> dailyTypes;

    private LocalDateTime notificationTime;

}
