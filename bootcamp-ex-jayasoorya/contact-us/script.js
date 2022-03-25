const detail = document.querySelector(".detailsForm")
const submitButton = document.querySelector(".detailsForm button")

submitButton.addEventListener("click",(e) => {
    e.preventDefault();

    console.log("Details Submitted");

    // const nameDetail = document.querySelector("[name="name"]");
    const ageDetail = document.querySelector(".age");
    const nameDetail = document.querySelector(".name");
    const emailDetail = document.querySelector(".email");

    detail.innerHTML=`
    <p>Name: ${nameDetail.value}</p>
    <p>Age: ${ageDetail.value}</p>
    <p>Email: ${emailDetail.value}</p>
    `

})


