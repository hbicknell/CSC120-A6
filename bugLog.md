## Bug 1
Brief description: When the computer constructor makes a computer, it sets the memory to 16, not what the input was
Failed unit test: computer constructor test

## Bug 2
Brief description: When the computer constructor makes a computer, it sets the price to 0, not the inputed prices
Failed unit test: computer constructor test

## Bug 3
Brief description: setOs set's the computers OS to "none" not the inputed newOS 
Failed unit test: failed testSetOS

## Bug 4
Brief description: the buy method in resale shop does not buy the correct computer/put it in the computer inventory
Failed unit test: testBuyComputerBuysCorrectComputer

## Bug 5
Brief description: the buy method in resale shop does not check if the computer is already in the inventory before buying it, leading to duplicates
Failed unit test: testBuyComputerDoesNotDuplicate

## Bug 6
Brief description: Print Inventory of Resale shop tries to access an index that is out of bounds
Failed unit test: testPrintInventoryOnNotEmpty

## Bug 7
Brief description:  sell method does not throw an exception when a computer is not in inventory
Failed unit test: testSellThrowsException

## Bug 8
Brief description: refurbish does not update to the new OS correctly
Failed unit test: testRefurbishUpdatesOSCorrectly

## Bug 9
Brief description:  The pricing is very weird for the computers refurbishing, perhaps this was intentional but computers made before 2012 but after 2000 have a price of 2500 while those made after then only have 550
Failed unit test: testRefurbishDoesPriceCorrectly

## Bug 10
Brief description: the toString method does not return a proper string, because it cocatonates but all that it concatonates is not a string without making it a string
Failed unit test: test_toString