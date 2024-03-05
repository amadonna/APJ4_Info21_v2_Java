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
    @Column(name = "parenttask", columnDefinition = "text")
    private String parentTasks;
    @Column(name = "maxxp", columnDefinition = "int")
    private  int maxXp;
}
