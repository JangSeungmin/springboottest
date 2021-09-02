package test.demo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.demo.domain.entity.Board;

public interface BoardRepository extends JpaRepository<Board,Long> {
}
