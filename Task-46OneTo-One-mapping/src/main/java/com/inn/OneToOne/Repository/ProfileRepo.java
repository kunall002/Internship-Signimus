package com.inn.OneToOne.Repository;


import com.inn.OneToOne.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepo extends JpaRepository<Profile, Long> {

}
