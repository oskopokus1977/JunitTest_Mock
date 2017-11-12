package mock;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ListTest {

    @Test
    public void listTest(){
        List list = mock(List.class);
        when(list.get(12)).thenReturn(12);
        when(list.get(11)).thenReturn(11);
        Assert.assertSame(list.get(12),12);
        Assert.assertSame(list.get(11),11);
        verify(list, times(2)).get(anyInt());
    }

    @Test
    public void listSpyTest(){
        List list = new ArrayList(Arrays.asList(12,23,23,24,23));
        List spyList = spy(list);
        Assert.assertSame(list.get(3),24);

        when(spyList.get(0)).thenReturn(35);
        Assert.assertSame(spyList.get(0),35);

         }
}
