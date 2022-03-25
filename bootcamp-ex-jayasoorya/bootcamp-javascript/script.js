function onAddItem(e){
    e.preventDefault();
    console.log("Alerted")
    alert("Alerted")
}



const addButton = document.querySelector(".onAddItem");
const tab = document.querySelector("tbody");

addButton.addEventListener("click", (e)=>{
    e.preventDefault();
    const itemName = document.querySelector(".itemName");
    const itemQuant = document.querySelector(".itemQuant");
    console.log("Button Pressed");
    const newItem = document.createElement("tr");
    newItem.innerHTML = `
        <tr>
        <td>${itemName.value}</td>
        <td>${itemQuant.value}</td> 
        <td><button className="removeButton">Remove</button></td>
        </tr>`;
    tab.appendChild(newItem);
    itemName.value="";
    itemQuant.value="";

})

function removeItem(){
    console.log("Item removed");
}

tab.addEventListener("click", (e)=>{
    console.log("Deleted");
    e.target.closest("tr").remove();
})


