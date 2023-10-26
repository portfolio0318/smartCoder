package com.smartcoder.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name = "programmer")
@Data
public class Programmer extends User {
}
