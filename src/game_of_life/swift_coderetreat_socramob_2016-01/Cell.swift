//
//  Cell.swift
//  CodeRetreat
//
//  Created by Andreas Bauer on 13.02.16.
//  Copyright © 2016 Andreas Bauer. All rights reserved.
//

import UIKit

enum CellState {
    case ALIVE
    case DEAD
}

class Cell: NSObject {
    var neighbours: Int = 0
    var state = CellState.ALIVE
    
    func nextGeneration() -> Cell {
        let cell = Cell()
        switch neighbours {
        case 2:
            switch state {
            case .ALIVE:
                cell.state = .ALIVE
            case .DEAD:
                cell.state = .DEAD
            }
        case 3:
            cell.state = .ALIVE
        default:
            cell.state = .DEAD
        }
        return cell

//        if neighbours == 0 {
//            let cell = Cell()
//            cell.state = .DEAD
//            return cell
//        } else {
//            let cell = Cell()
//            cell.state = .ALIVE
//            return cell
//        }
    }
}
