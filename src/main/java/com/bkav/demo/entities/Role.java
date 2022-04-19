package com.bkav.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="role")

public class Role {
    @Id
    private String roleName;

    @OneToMany(mappedBy = "role")
    List<RoleAccount> roleAccountList;
}
