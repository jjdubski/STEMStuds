function debtCalc(){
    var payment = document.getElementById("payment").value;
    let debt = document.getElementById("debt").value;
    var interest = document.getElementById("interestD")
    var output = parseFloat(payment)*12;
    var count = 0;
    while(parseInt(debt)>0){
        count++;
        debt = parseFloat(debt) - output;
        if(parseInt(debt>0)){
            debt = parseFloat(debt)*parseFloat(interest);
        }
    }
    alert("It would take " + parseInt(count) + " years to pay off debt.");
}

function simpleInterestCalc(){
    var initial = document.getElementById("principal").value;
    var interest = document.getElementById("interestI").value;
    var contribution = document.getElementById("contribution").value;
    var year = document.getElementById("years").value;
    var output = parseFloat(interest)*parseFloat(year);
    if(parseFloat(contribution)!=0){
        output += parseFloat(contribution*12)*parseFloat(year);
    }
    output+=parseFloat(initial);
    alert("You would have " + output + " after " + parseFloat(year) + " years.");
}

/*function compoundInterestCalc(){
    var initial = document.getElementById("principal").value;
    var interest = document.getElementById("interestI").value;
    var contribution = document.getElementById("contribution").value;
    var year = document.getElementById("years").value;
    var output = 1+parseFloat(interest)/100;
    for (let i = 1; i < parseInt(year); i++) {
        output = (output*output);
        console.log(output);
        if(parseFloat(contribution)!=0){
            initial += parseFloat(contribution*12);
        }
    }
    alert(output*parseFloat(initial));
}*/

function goalCalc(){
    let goal = document.getElementById("goal").value;
    let savings = document.getElementById("savings").value;
    let interest = document.getElementById("interestG").value;
    interest = (parseFloat(interest)/100);
    console.log(interest);
    let output = parseFloat(savings)*(parseFloat(interest));
    console.log("output: " +output); 
    let count = 0;
    let total = parseFloat(savings);
    console.log("before "+ total);
    while(parseFloat(goal) > parseFloat(total)){
        count++;
        console.log("during "+ count + " " + total);
        total += output;
        console.log("after "+ count + " " + total);
        output = parseFloat(total)*parseFloat(interest)
    }
    alert("It would take " + parseInt(count) + " years to accumulate " + parseFloat(goal));
}
