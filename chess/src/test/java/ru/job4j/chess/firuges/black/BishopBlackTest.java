package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenCreateFigurePosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Cell rsl = bishopBlack.position();
        assertThat(bishopBlack.position(), is(rsl));
    }

    @Test
    public void whenCopyH6() {
        BishopBlack bishopBlack = new BishopBlack(Cell.F8);
        Figure rsl =  bishopBlack.copy(Cell.H6);
        assertThat(rsl.position(), is(Cell.H6));
    }

    @Test
    public void whenWayC1ToH6() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] rsl = bishopBlack.way(Cell.H6);
        assertThat(rsl, is(new Cell[] {Cell.D2, Cell.E3, Cell.F4, Cell.G5, Cell.H6}));
    }

    @Test
    public void whenWayH8ToA1() {
        BishopBlack bishopBlack = new BishopBlack(Cell.H8);
        Cell[] rsl = bishopBlack.way(Cell.A1);
        assertThat(rsl, is(new Cell[] {Cell.G7, Cell.F6, Cell.E5, Cell.D4, Cell.C3, Cell.B2, Cell.A1,}));
    }
}