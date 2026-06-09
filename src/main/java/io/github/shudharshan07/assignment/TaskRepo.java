package io.github.shudharshan07.assignment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepo extends JpaRepository<Integer, Object> {
    @Query("SELECT e FROM task e WHERE e.title = :title")
    List<Task> findByDepartmentJpql(@Param("dept") String department);

    @Query("SELECT e.title FROM Employee e WHERE e.task > :task")
    List<String> findHighEarnersNamesJpql(@Param("task") Double task);
}
