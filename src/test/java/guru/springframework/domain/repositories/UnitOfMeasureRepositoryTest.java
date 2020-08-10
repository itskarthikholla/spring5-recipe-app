package guru.springframework.domain.repositories;

import guru.springframework.domain.UnitOfMeasure;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryTest {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;


    @Before
    public void setUp() throws Exception {

    }

    @Test
    @DirtiesContext
    //Use this Dirties to restart the context
    public void findByDescription() {
        Optional<UnitOfMeasure> byDescription = unitOfMeasureRepository.findByDescription("Teaspoon");
        assertEquals(byDescription.get().getDescription(), "Teaspoon");

    }

    @Test
    public void findByDescriptionCup() {
        Optional<UnitOfMeasure> byDescription = unitOfMeasureRepository.findByDescription("Cup");
        assertEquals(byDescription.get().getDescription(), "Cup");

    }
}