package fr.eni.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.protobuf.Field.Kind;

public interface KindDAO extends JpaRepository<Kind, Integer>{

}
