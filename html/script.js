function debtCalc(){
    const payment = document.getElementById("payment").value;
    const debt = document.getElementById("debt").value;
    const interest = document.getElementById("interestD")
    var output = parseFloat(debt)*parseFloat(payment);
    alert(output);
}

function interestCalc(){
    var initial = document.getElementById("principal").value;
    var interest = document.getElementById("interestI").value;
    var contribution = document.getElementById("contribution").value;
    var year = document.getElementById("years").value;
    var output = parseFloat(interest)*parseFloat(year);
    if(parseFloat(contribution)!=0){
        output += parseFloat(contribution*12)*parseFloat(year);
    }
    alert(output+parseFloat(initial));
}

function goalCalc(){
    var goal = document.getElementById("goal").value;
    var savings = document.getElementById("savings").value;
    var interest = document.getElementById("interestG").value;
    var output1 = parseFloat();
    var output2 = parseFloat();
    alert();
}
