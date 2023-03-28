import { useEffect, useState } from 'react';
import './Pieprasijumi.css';


export default function Pieprasijumi() {

  const classes = {
    container: "my-container",
    block: "my-block",
    block2: "my-block2",
    label: "my-label",
    input: "my-input",
    submit: "my-submit",
    item: "my-item"
  };

  const[vards, setVards] = useState('')
  const[tehnika, setTehnika] = useState('')
  const[pamatojums, setPamatojums] = useState('')
  const[laiks] = useState(new Date())
  const[pieprasijumi, setPieprasijumi]=useState([])
  const [showData, setShowData] = useState(false)

  const handleClick=(e) => {
    e.preventDefault()
    const pieprasijums={vards, tehnika, pamatojums, laiks}
    console.log(pieprasijums)
    fetch("http://localhost:8080/pieprasijumi/add",{
      method: "POST",
      headers: {"Content-type" : "application/json"},
      body: JSON.stringify(pieprasijums)
    }).then(() => {
      console.log("Pieprasījums iesniegts")
    })}

useEffect(()=>{
  console.log("Jauns pieprasījums iesniegts")
})

useEffect(()=>{
  fetch("http://localhost:8080/pieprasijumi/getAll")
  .then(res=>res.json())
  .then((result)=>{
    setPieprasijumi(result);
  }
  )
},[showData])

  return (
    <div className={classes.container}>
        <form className={classes.block}>
          <div>
            <h1 style={{fontSize: "25px"}}>Datortehnikas pieprasīšanas forma</h1>
          </div>

          <div>
          <label className={classes.label}>
            Vārds, uzvārds:
          </label>
          <input type="text" name="Vārds, uzvārds" className={classes.input}
          value={vards}
          onChange={(e)=>setVards(e.target.value)}/>
          </div>

          <div>
          <label className={classes.label} >
            Datortehnikas nosaukums:
          </label>
          <input type="text" name="Datortehnikas nosaukums" className={classes.input}
          value={tehnika}
          onChange={(e)=>setTehnika(e.target.value)}
          />
          </div>

          <div>
          <label className={classes.label}>
            Pamatojums:
          </label>
          <input type="text" name="Pamatojums" className={classes.input}
          value={pamatojums}
          onChange={(e)=>setPamatojums(e.target.value)}
          />
          </div>

          <button type="submit" onClick={handleClick}>Iesniegt</button>
        </form>

        <div className={classes.block2}>
          <button onClick={() => setShowData(!showData)}>
            {showData ? "Paslēpt pieprasījumus" : "Parādīt visus pieprasījumus"}
          </button>

          {showData && pieprasijumi.map((item, index) => (
            <div className={classes.item} key={index}>
              <p>Vārds, uzvārds: {item.vards}</p>
              <p>Datortehnikas nosaukums: {item.tehnika}</p>
              <p>Pamatojums: {item.pamatojums}</p>
              <p>Ieniegšanas laiks: {item.laiks}</p>
            </div>
          ))}
        </div>

      </div>
      
  );
}
