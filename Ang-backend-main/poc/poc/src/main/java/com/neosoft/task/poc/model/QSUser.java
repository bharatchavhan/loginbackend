package com.neosoft.task.poc.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name ="QS_User")
public class QSUser {
    @Id
    private  String userName;
    private String password;
}
