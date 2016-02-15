<?php
/**
 * User: aachim
 * Date: 12.02.16
 * Time: 21:12
 */

include_once "myclass.php";
include_once "Cell.php";



class myclassTest extends \PHPUnit_Framework_TestCase {

    public function testLivingCellWithZeroNighbours() {
        $cell = new Cell();
        $cell->addNighbours(0);
        $newCell = $cell->nextGen();
        $this->assertFalse($cell->isAlive(), 'This test is okay');
    }

    public function testLivingCellWithOneNighbour() {
        $cell = new Cell();
        $cell->addNighbours(1);
        $newCell = $cell->nextGen();
        $this->assertFalse($cell->isAlive(), 'This test is okay');
    }

    public function testLivingCellWithTwoNighbours() {
        $cell = new Cell();
        $cell->addNighbours(2);
        $newCell = $cell->nextGen();
        $this->assertTrue($cell->isAlive(), 'This test is okay');
    }

    public function testLivingCellWithThreeNighbours() {
        $cell = new Cell();
        $cell->addNighbours(3);
        $newCell = $cell->nextGen();
        $this->assertTrue($cell->isAlive(), 'This test is okay');
    }

    public function testDeadCellWithThreeNighbours() {
        $cell = new Cell();
        $cell->livingStatus(false);
        $cell->addNighbours(3);
        $newCell = $cell->nextGen();
        $this->assertTrue($cell->isAlive(), 'This test is okay');
    }

    public function testCellWithFourNighbours() {
        $cell = new Cell();
        $cell->livingStatus(true);
        $cell->addNighbours(4);
        $newCell = $cell->nextGen();
        $this->assertFalse($cell->isAlive(), 'This test is okay');
    }
}
 