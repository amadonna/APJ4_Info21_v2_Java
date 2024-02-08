package ru.arnaliev.school21.info21_v2_java.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tasks", schema = "public")
@AllArgsConstructor
@Data
@NoArgsConstructor
@Getter
@Setter
public class Tasks {
    @Id
    @Column(name = "title", columnDefinition = "text")
    private String title;
    @ManyToOne
    @JoinColumn(name = "parenttask", referencedColumnName = "title")
    private Tasks parentTasks;
    @Column(name = "maxxp")
    private  int maxXp;
}
