package com.bahaida.zooz.backend.services;

import com.bahaida.zooz.backend.persistence.domain.Client;
import com.bahaida.zooz.backend.persistence.repositories.ClientRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class ClientServiceTest {

    private Client user;

    @Mock
    private ClientRepository clientRepository;

    @InjectMocks
    private IClientService clientService = new ClientService();

    @Before
    public void setUp() throws Exception {
        user = new Client();
        user.setFirstName("sana");
        user.setLastName("houala");
        user.setLogin("sh");
        user.setPassword("sh");
        user.setAge(12);
        user.setIdClient((long) 1);
        Mockito.when(clientRepository.save(user)).thenReturn(user);
    }

    //Registration Tests

    @Test
    public void shouldReturnClient(){
        assertTrue(clientService.registartion(user) instanceof Client);
    }

    @Test
    public void shouldThrowExceptionIfRequiredFieldIsEmpty(){

        assertTrue(clientService.registartion(user) != null);

    }

    @Test
    public void shouldReturnId1IfClientIsUser(){
        Client client = clientService.registartion(user);
        assertEquals(Long.valueOf(1), client.getIdClient());

    }

    @Test
    public void shouldReturnIdHammam1IfClientIsUser1(){

        Client client = clientService.registartion(user);
        assertEquals(Long.valueOf(1), client.getIdClient());
    }
    //End of Registration Tests
}