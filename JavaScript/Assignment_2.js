                                //Assignment-3        

      //  1. Employee Salary Processor
// const Salary = [
//   { Name: "Suresh", Salary: 35000 },
//   { Name: "Ramesh", Salary: 45000 },
//   { Name: "Jay", Salary: 70000 },
//   { Name: "Krish", Salary: 85000 }
// ];

// console.log(Salary)

// const filterSalary = Salary.filter(Sal=>Sal.Salary>40000)

// console.log(filterSalary)

// const Increment = filterSalary.map(emp=> ({
//     Name: emp.Name,
//     Salary: emp.Salary*1.10
// }))

// console.log(Increment)

// const level=Salary.map(emp=>({
//     Name:emp.Name,
//     Salary:emp.Salary,
//     level:emp.Salary >=70000 ? "Senior" :"Mid"
// }))

// console.log(level);

                    //2.Order Management System


 const Order =[{"amount":2000,"Quantity":10},
    {"amount":33000,"Quantity":1},
    {"amount":5000,"Quantity":5},
    {"amount":20000,"Quantity":1}
 ]                   

 const result = Order.map(item=>({
    TotalAmount:item.amount*item.Quantity,
    TotalQuantity:item.Quantity
 }))

 console.log(result);


