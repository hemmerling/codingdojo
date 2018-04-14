package com.hemmerling;

import static org.junit.Assert.*;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.internal.matchers.TypeSafeMatcher;

public class ZelleTest {

	@Test
	public void aNewCellHasNoNeighbors() {
		// Given

		// When
		Zelle zelle = new Zelle();

		// Then
		assertThat(zelle, hasNoNeighbors());
	}

	@Test
	public void aNewCellIsAlive() throws Exception {
		// GIVEN

		// WHEN
		Zelle zelle = new Zelle();

		// THEN
		assertThat(zelle, isAlive());
	}

	@Test
	public void aNewCellHasNeighbors() {
		// GIVEN

		// WHEN
		Zelle zelle = new Zelle();
		Zelle nachbar = new Zelle();
		zelle.addNeighbor(nachbar);

		// THEN
		assertThat(zelle, hasNeighbors());
	}

	@Test
	public void cellHasCorrectNumberOfNeighbors() throws Exception {

		// GIVEN
		Zelle zelle = new Zelle();
		Zelle nachbar1 = new Zelle();
		Zelle nachbar2 = new Zelle();

		// WHEN
		zelle.addNeighbor(nachbar1);
		zelle.addNeighbor(nachbar2);

		// THEN
		assertThat(zelle, hasNumberOfNeighbors(2));
	}

	@Test
	public void cellHasNotCorrectNumberOfNeighbors() throws Exception {

		// GIVEN
		Zelle zelle = new Zelle();
		Zelle nachbar1 = new Zelle();
		Zelle nachbar2 = new Zelle();
		Zelle nachbar3 = new Zelle();
		Zelle nachbar4 = new Zelle();

		// WHEN
		zelle.addNeighbor(nachbar1);
		zelle.addNeighbor(nachbar2);
		zelle.addNeighbor(nachbar3);
		zelle.addNeighbor(nachbar4);

		// THEN
		assertThat(zelle, hasNotNumberOfNeighbors(4));
	}

	private Matcher<Zelle> hasNumberOfNeighbors(
			final int expectedNumberOfNeighbors) {
		return new TypeSafeMatcher<Zelle>() {

			@Override
			public boolean matchesSafely(Zelle item) {
				return item.getNumberOfNeighbors() == expectedNumberOfNeighbors;
			}

			@Override
			public void describeTo(Description description) {
				description.appendText(" a cell with number of neighbors ")
						.appendValue(expectedNumberOfNeighbors);
			}
		};
	}

	private Matcher<Zelle> isAlive() {
		return new TypeSafeMatcher<Zelle>() {
			@Override
			public boolean matchesSafely(Zelle item) {
				return item.isAlive();
			}

			@Override
			public void describeTo(Description description) {
				description.appendText(" an alive cell");
			}

		};
	}

	private Matcher<Zelle> hasNoNeighbors() {
		return new TypeSafeMatcher<Zelle>() {

			@Override
			public boolean matchesSafely(Zelle item) {
				return item.getNumberOfNeighbors() == 0;
			}

			@Override
			public void describeTo(Description description) {
				description.appendText(" a cell with no neighbors");
			}
		};
	}

	private Matcher<Zelle> hasNeighbors() {
		return new TypeSafeMatcher<Zelle>() {

			@Override
			public boolean matchesSafely(Zelle item) {
				return item.getNumberOfNeighbors() > 0;
			}

			@Override
			public void describeTo(Description description) {
				description.appendText(" a cell with neighbors");
			}
		};
	}
}
