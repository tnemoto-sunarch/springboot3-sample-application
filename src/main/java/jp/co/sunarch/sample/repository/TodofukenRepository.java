package jp.co.sunarch.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.sunarch.sample.entity.TTodofuken;

@Repository
public interface TodofukenRepository extends JpaRepository<TTodofuken, Long>{

}
