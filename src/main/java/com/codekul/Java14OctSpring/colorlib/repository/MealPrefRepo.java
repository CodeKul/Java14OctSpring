package com.codekul.Java14OctSpring.colorlib.repository;

import com.codekul.Java14OctSpring.colorlib.domain.MealPreference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealPrefRepo extends JpaRepository<MealPreference,Integer> {
}
