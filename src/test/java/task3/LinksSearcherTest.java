package task3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Мария on 02.03.2017.
 */
public class LinksSearcherTest {
    @Test
    public void readSentencesTest() throws Exception {
        LinksSearcher linksSearcher = new LinksSearcher();
        linksSearcher.readSentences();

        assertTrue(linksSearcher.getSequenceBuilder().length() > 0);

    }


//        linksSearcher.readSentences();
//
//        assertFalse(linksSearcher.areLinksInRightOrder());
//
//        System.out.println(linksSearcher.getAllSentencesWithLinks());


}