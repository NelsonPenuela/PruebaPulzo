package model

type Consolidado struct{
	Numero 		int 	 	  `json:"numero"`
	Boletin  		int| 	  	`json:"boletin"`
	Tipo_Boletin  	 		string  	  `json:"tipo_boletin"`
	Desc_Coporacion  		string 	  	`json:"desc_coporacion"`
	Departamento  	 		int  	  `json:"departamento"`
	Desc_departamento  		string 	  	`json:"desc_departamento"`
	Municipio  	 		int  	  `json:"municipio"`
	Desc_Municipio  		string 	  	`json:"Desc_Municipio"`
	Dia  	 		int  	  `json:"dia"`
	Mes  		int 	  	`json:"mes"`
	Anio  	 		int  	  `json:"anio"`
	Hora  		int 	  	`json:"hora"`
	Minuto  	 		int  	  `json:"minuto"`
	Mesas_instaladas  		int 	  	`json:"mesas_instaladas"`
	Mesas_informadas  	 		int  	  `json:"mesas_informadas"`
	Porc_Mesas_informadas  		float64 	  	`json:"porc_mesas_informadas"` //Preguntar
	Potencial_sufragantes  	 		int  	  `json:"potencial_sufragantes"`
	Total_Sufragantes  		int 	  	`json:"total_sufragantes"`
	Porc_Sufragantes  	 		float64  	  `json:"porc_sufragantes"`
	Votos_Nulos  		int 	  	`json:"Votos_Nulos"`
	Porc_Votos_Nulos  	 		float64  	  `json:"porc_sotos_sulos"`
	Votos_No_Marcados  		int 	  	`json:"votos_no_marcados"`
	Porc_Votos_No_Marcados  	 		float64  	  `json:"porc_votos_no_marcados"`
	Circunscripcion  		int 	  	`json:"circunscripcion"`
	Desc_Circunscripcion  	 		string  	  `json:"desc_circunscripcion"`
	Numero_Curules  		int 	  	`json:"numero_curules"`
	Partido  	 		int  	  `json:"partido"`
	Descripcion_Partido  		string 	  	`json:"despripcion_partido"`
	Votos  	 		int  	  `json:"votos"`
	Porc  		float64 	  	`json:"porc"`
	Grid  	 		string  	  `json:"grid"`

	}