package edu.udacity.java.nano.chatroomstarter;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataJpaTest
public class DataJpaUnitTest {
    @Autowired
    TestEntityManager entityManager;

    public void entityManagerAvailable(){
        assertNotNull(entityManager);
    }
}
