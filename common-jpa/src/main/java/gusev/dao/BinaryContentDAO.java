package gusev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import gusev.entity.BinaryContent;

public interface BinaryContentDAO extends JpaRepository<BinaryContent, Long> {
}
