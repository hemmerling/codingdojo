//
//  CellTests.swift
//  CodeRetreat
//
//  Created by Andreas Bauer on 13.02.16.
//  Copyright © 2016 Andreas Bauer. All rights reserved.
//

import XCTest
@testable import CodeRetreat

class CellTests: XCTestCase {

    let cell = Cell()
    
    func testCellIsCreated() {
        XCTAssertNotNil(cell)
    }
    
    func testLivingCellHasZeroNeighboursAndDies() {
        let newCell = cell.nextGeneration()
        XCTAssertEqual(newCell.state, CellState.DEAD)
    }

    func testDeadCellHasZeroNeighboursAndDies() {
        cell.state = .DEAD
        let newCell = cell.nextGeneration()
        XCTAssertEqual(newCell.state, CellState.DEAD)
    }

    
    func testLivingCellHasOneNeighbourAndLives() {
        cell.neighbours = 1
        let newCell = cell.nextGeneration()
        XCTAssertEqual(newCell.state, CellState.DEAD)
    }

    func testLivingCellHasTwoNeighboursAndLives() {
        cell.neighbours = 2
        let newCell = cell.nextGeneration()
        XCTAssertEqual(newCell.state, CellState.ALIVE)
    }

    func testDeadCellHasTwoNeighboursAndLives() {
        cell.state = .DEAD
        cell.neighbours = 2
        let newCell = cell.nextGeneration()
        XCTAssertEqual(newCell.state, CellState.DEAD)
    }

    
    func testLivingCellHas3NeighboursAndLives() {
        cell.neighbours = 3
        let newCell = cell.nextGeneration()
        XCTAssertEqual(newCell.state, CellState.ALIVE)
    }
    
    func testDeadCellHas3NeighboursAndLives() {
        cell.state = .DEAD
        cell.neighbours = 3
        let newCell = cell.nextGeneration()
        XCTAssertEqual(newCell.state, CellState.ALIVE)
    }

}
