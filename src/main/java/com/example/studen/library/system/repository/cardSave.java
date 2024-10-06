package com.example.studen.library.system.repository;

//package com.example.studen.library.system.repository; // Make sure to place this in the correct package

import com.example.studen.library.system.model.Card; // Import the Card model
import org.springframework.data.jpa.repository.JpaRepository; // Import JpaRepository
import org.springframework.stereotype.Repository; // Import Repository

@Repository
public interface cardSave extends JpaRepository<Card, Integer> {
    // You can define additional query methods here if needed
}
