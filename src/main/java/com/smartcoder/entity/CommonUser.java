package com.smartcoder.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "common_user")
public class CommonUser extends User {

}
