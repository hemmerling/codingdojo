<?php
/**
 * User: aachim
 * Date: 13.02.16
 * Time: 13:38
 */

class Cell {
    private $numberOfNeighbours;
    private $myLivingStatus = true;
    public function addNighbours($number) {
        $this->numberOfNeighbours = $number;
    }

    public function isAlive() {
        return (($this->numberOfNeighbours == 2) && $this->myLivingStatus ) || ($this->numberOfNeighbours == 3);
    }

    public function nextGen() {
        return $this;
    }

    public function livingStatus($status) {
        $this->myLivingStatus = $status;
    }
} 