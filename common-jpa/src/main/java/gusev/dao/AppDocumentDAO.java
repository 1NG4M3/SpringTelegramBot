package gusev.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import gusev.entity.AppDocument;

public interface AppDocumentDAO extends JpaRepository<AppDocument, Long> {
}