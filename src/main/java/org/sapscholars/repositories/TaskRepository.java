package org.sapscholars.repositories;

import java.util.List;

import org.sapscholars.entities.Task;
import org.sapscholars.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task, Long>{

	List<Task> findByUser(User user); 
	
}
