package com.in28minutes.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SomeBusinessImplMockTest {

    @Mock
    private DataService dataServiceMock;

    @InjectMocks
    private SomeBusinessImpl businessImpl;

    @Test
    void findTheGreatestFromAllData_basicScenario() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {12,12,32});
        assertEquals(32, businessImpl.findTheGreatestFromAllData());
    }

    @Test
    void findTheGreatestFromAllData_OneValue() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {22});
        assertEquals(22, businessImpl.findTheGreatestFromAllData());
    }
    @Test
    void findTheGreatestFromAllData_EmptyArray() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(Integer.MIN_VALUE, businessImpl.findTheGreatestFromAllData());
    }

    //    @Test
//    void findTheGreatestFromAllData_basicScenario() {
//        DataService dataServiceMock = mock(DataService.class);
//        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {12,12,32});
//        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
//        assertEquals(32, businessImpl.findTheGreatestFromAllData());
//    }
//    @Test
//    void findTheGreatestFromAllData_OneValue() {
//        DataService dataServiceMock = mock(DataService.class);
//        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {22});
//        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
//        assertEquals(22, businessImpl.findTheGreatestFromAllData());
//    }
}

