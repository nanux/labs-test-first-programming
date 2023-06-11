package com.assetco.search.results;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static com.assetco.search.results.UserSegment.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class UserSegmentTest {

    @Test
    void allValuesArePresent() {
        assertThat(UserSegment.values(), hasItemInArray(NewsMedia));
        assertThat(UserSegment.values(), hasItemInArray(OtherMedia));
        assertThat(UserSegment.values(), hasItemInArray(GeneralPublic));
    }
}
