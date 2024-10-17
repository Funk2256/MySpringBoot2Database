package ru.krasheninnikov.MySpringBoot2Database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.krasheninnikov.MySpringBoot2Database.entity.Discipline;

public interface DisciplineRepository extends JpaRepository<Discipline, Integer> {
}
