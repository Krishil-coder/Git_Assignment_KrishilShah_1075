// 1: Student Report System
// Calculate average marks for each student
// Add a new property average using map()
// Assign result:
// • Avg ≥ 75 → "Distinction"
// • Avg ≥ 50 → "Pass"
// • Else → "Fail"

const students = [
  { name: "Raj", marks: [65, 78, 66, 55] },
  { name: "Meet", marks: [85, 88, 79, 85] },
  { name: "Krish", marks: [75, 68, 86, 95] }
];

const result = students.map(student => {

    let sum = 0;

    for (let i = 0; i < student.marks.length; i++) {
        sum += student.marks[i];
    }

    let average = sum / 4;

    let grade;
    if (average >= 75) {
        grade = "Distinction";
    } else if (average >= 50) {
        grade = "Pass";
    } else {
        grade = "Fail";
    }

    return {
        ...student,
        average: average,
        result: grade
    };
});

console.log(result);
// const MappedValue =Raj.add(Raj.Average=Average)
// console.log(Raj)

// 
// const Average= Raj/4
// console.log(Average)
// const MappedValue =Raj.map(Average=>Average/4)
// console.log(MappedValue)

// const Average = Cloud+Development+Programming+Database/4;
// console.log(Raj.Average);

// console.log(Raj.Averag=34);
// console.log(Raj);


    //2: Shopping Cart Analyzer

        function ShoppingCart(first,...Price){
                console.log("Price of Products is " +first)
                console.log("Quantity of product is " +Price)
                const Total = first*Price
                console.log("Total bill is " +Total)
        }

        ShoppingCart(1000,10)

       // 3: User Profile Updater

        
        const person ={
            name:"Krishil Shah",
            age:21,
            City:'Surat',
            Hobbies:"Cricket"
        } 
        function  ProfileUpdater(){
            const updatedPersonDetails ={
            ...person,
            City:"Vadodara"
        }
        console.log(updatedPersonDetails)
        console.log(updatedPersonDetails.Profesion="Software Developer")
        console.log(updatedPersonDetails)
        }    

        ProfileUpdater()

       // 4: Product Filter & Transform

        const Products=[{Name:"T-Shirt", Price:100},
                        {Name:"Laptop", Price:50000},
                        {Name:"Mouse", Price:1100},
                        {Name:"KeyBoard", Price:10000}
        ]

        const filter=Products
        .filter(Products=>Products.Price>1000)
        .map(Products=>({
            ...Products,
            AfterdiscountPrice:Products.Price*0.9
        }))

        console.log(filter)

      //5: Dynamic Number Processor  

      const Numbers=[1,2,3,4,5,6,7,8,9]

       const Even=
        Numbers.filter(num=>num%2==0)
        const EvenSum =Even.reduce((num,res)=>num+res,0)

        const Odd= 
       Numbers.filter(num=>num%2!=0)
        const OddSum =   Numbers.reduce((num,res)=>num+res,0)
      
       console.log(Even)
        console.log("Sum of even Number is "+EvenSum)
       console.log(Odd)
        console.log("Sum of Odd Number is "+OddSum)

     