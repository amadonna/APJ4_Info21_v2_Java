package ru.arnaliev.school21.info21_v2_java.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "peers")
@AllArgsConstructor
@Data
@NoArgsConstructor
@Getter
@Setter
public class Peer {
    @Id
    @Column(name = "nickname", columnDefinition = "text")
    private String nickname;

    @Temporal(TemporalType.DATE)
    @Column(name = "birthday")
    private Date birthday;

}
