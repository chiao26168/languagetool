package org.languagetool.rules.en;

import org.junit.Test;

import java.util.Set;
import static org.junit.Assert.assertEquals;
public class AvsAnDataTest {
  @Test
  public void testloadWordsrequiresA() {
    AvsAnData avsAnData = new AvsAnData();
    Set<String> actual = avsAnData.loadWords("/en/det_a.txt");
    assertEquals(actual.size(), 740);
  }

  @Test
  public void testloadWordsrequiresB() {
    AvsAnData avsAnData = new AvsAnData();
    Set<String> actual = avsAnData.loadWords("/en/det_an.txt");
    assertEquals(actual.size(), 3792);
  }
}
