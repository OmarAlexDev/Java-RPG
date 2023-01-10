	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import heroes.*;
	import enemigos.*;
	import objetos.*;
	import mapa.*;

public class Ventana extends JFrame{
	
			private JPanel panel1,panel2,panel3,panel4,panel5,panel6,panel7,panel8,panel9,panel10,panel11,panel12,panel13,panel14,panel15,panel16,panel17,panel18,panel19,panel20,panel21,panel22,panel23,panel24,panel25,panel26;
			private JTextField tnombre,tpersonaje; 
			private JLabel lcontinuar, lsplash, lnombre, lpersonajesimg, lpersonajestext, ldocmar, lhistoria, ltravel, lcasilla1, lcasilla2, lcasilla3, lcasilla4, lcasilla5, lcasilla6, lcasilla7, lcasilla8, lcasilla9, lcasilla10, lcasilla11, lcasilla12, lcasilla13, lcasilla14, lcasilla15, lcasilla16, lcasilla17, lcasilla18, lcasilla19, lcasilla20,lcasilla21, stats, jinventario1, jinventario2, jinventario3, jinventario4, jinventario5,jinventario6, lerror;
			private JButton continuarBoton1, continuarBoton2, continuarBoton3, continuarBoton4, continuarBoton5, loadBoton, avanzar1, avanzar2, avanzar3, avanzar4, avanzar5, avanzar6, avanzar7, avanzar8, avanzar9, avanzar10, avanzar11, avanzar12, avanzar13, avanzar14, avanzar15, avanzar16, avanzar17, avanzar18, avanzar19, avanzar20,botonGuardar;
			private Heroe h;
			private String statsSalud;
			private Mapa map = new Mapa();
			private int i=0;
			private int flag;

		// Creacion de los personajes 

			// Enemigos basicos
			//	Enemigo ejemplo = new Enemigo(int posEnemigoX, String nombre, int ataque, int vida, int xpReward);

				Enemigo momia1 = new Enemigo(1, "Momia", 5 + (int)(Math.random() * ((15 - 5) + 1)), 150,10);
				Enemigo momia2 = new Enemigo(2, "Momia", 5 + (int)(Math.random() * ((15 - 5) + 1)), 150,10);
				Enemigo momia3 = new Enemigo(3, "Momia", 5 + (int)(Math.random() * ((15 - 5) + 1)), 150,10);
				Enemigo momia4 = new Enemigo(4, "Momia", 5 + (int)(Math.random() * ((15 - 5) + 1)), 150,10);
				
				Enemigo romano6 = new Enemigo(6, "Romano", 10 + (int)(Math.random() * ((20 - 10) + 1)), 200,15);
				Enemigo romano7 = new Enemigo(7, "Romano", 10 + (int)(Math.random() * ((20 - 10) + 1)), 200,15);
				Enemigo romano8 = new Enemigo(8, "Romano", 10 + (int)(Math.random() * ((20 - 10) + 1)), 200,15);
				Enemigo romano9 = new Enemigo(9, "Romano", 10 + (int)(Math.random() * ((20 - 10) + 1)), 200,15);
				
				Enemigo caballero10 = new Enemigo(10, "Caballero", 15 + (int)(Math.random() * ((25 - 15) + 1)), 250,20);
				Enemigo caballero11 = new Enemigo(11, "Caballero", 15 + (int)(Math.random() * ((25 - 15) + 1)), 250,20);
				Enemigo caballero12 = new Enemigo(12, "Caballero", 15 + (int)(Math.random() * ((25 - 15) + 1)), 250,20);
				Enemigo caballero13 = new Enemigo(13, "Caballero", 15 + (int)(Math.random() * ((25 - 15) + 1)), 250,20);
				Enemigo caballero14 = new Enemigo(14, "Caballero", 15 + (int)(Math.random() * ((25 - 15) + 1)), 250,20);
				
				Enemigo nazi16 = new Enemigo(16, "Nazi", 20 + (int)(Math.random() * ((30 - 20) + 1)), 300, 25);
				Enemigo nazi17 = new Enemigo(17, "Nazi", 20 + (int)(Math.random() * ((30 - 20) + 1)), 300, 25);
				Enemigo nazi18 = new Enemigo(18, "Nazi", 20 + (int)(Math.random() * ((30 - 20) + 1)), 300, 25);
				Enemigo nazi19 = new Enemigo(19, "Nazi", 20 + (int)(Math.random() * ((30 - 20) + 1)), 300, 25);
				
			//Enemigos de area
				
				EnemigoJefe faraon = new EnemigoJefe(5, "Akenaton", 15 + (int)(Math.random() * ((20 - 15) + 1)), 225, 10, 50);
				EnemigoJefe julioCesar = new EnemigoJefe(10, "Neron", 20 + (int)(Math.random() * ((25 - 20) + 1)), 275, 20, 100);
				EnemigoJefe vlady = new EnemigoJefe(15, "Vlady", 25 + (int)(Math.random() * ((30 - 25) + 1)), 325, 30, 150);
				EnemigoJefe hitler = new EnemigoJefe(20, "HITLER", 30 + (int)(Math.random() * ((35 - 30) + 1)), 375, 40, 200);
				
			// Tipos de Héroes
			
				/*
				Moto harley = new Moto("Harley", 0,  0, 0, 50, 100, 50);
				Carro deLorean = new Carro("DeLorean", 0, 0, 0, 67, 66, 67);
				Camioneta hummer = new Camioneta("HUMMER", 0,  0, 0, 100, 25, 75);
				*/
				
		// Creacion de los objetos
			
			// Armas
			
				Objeto espada = new Arma("Espada (10 ATK)", 10);
				Objeto arco = new Arma("Arco (11 ATK)", 10);
				
				Objeto bayoneta = new Arma("Bayoneta (15 ATK)", 15);
				Objeto daga = new Arma("Daga (16 ATK)", 15);
			
				Objeto ballesta = new Arma("Ballesta (21 ATK)", 15);
				Objeto catapulta = new Arma("Catapulta (22 ATK)", 15);
				
				Objeto ak47 = new Arma("AK47 (20 ATK)", 20);
				Objeto bombaAtomica = new Arma("Bomba Atomica (150 ATK)", 150);
				
			// Objetos de vida 
				
				Objeto medioCorazon = new RecipienteVida(50 , "Medio Corazon (50 HP)");
				Objeto corazonCompleto = new RecipienteVida(100 , "Corazon completo (100 HP)");
				Objeto cuartoCorazon = new RecipienteVida(25 , "Cuarto de Corazon (25 HP)");
				
			// Objetos de gas (Se usa para ataques especiales)
				Objeto litroGas= new RecipienteGas("Litro de Gasolina (25 GAS)", 25);
				Objeto galonGas= new RecipienteGas("Galon de Gasolina (50 GAS)", 50);
				Objeto garrafonGas= new RecipienteGas("Garrafon de Gasolina (100 GAS)", 100);
			
			// Objetos historicos
				Objeto estatuaRamses = new Objeto("Estatua de Ramsses II");
				Objeto estatuaMarte = new Objeto("Estatua de Marte");
				Objeto espadaEnLaPiedra = new Objeto("Espada en la Pieda");
				Objeto diario = new Objeto("Diario Anna Frank");
				
			//Agregar objetos inventario
				
				
	// Crear Casillas
				//Casillas Egipto
				Casilla c1 = new Casilla(0, null, null);
				Casilla c2 = new Casilla(1, momia2, cuartoCorazon);
				Casilla c3 = new Casilla(2, momia3, arco);
				Casilla c4 = new Casilla(3, momia4, litroGas);
				Casilla c5 = new Casilla(4, faraon, estatuaRamses);


				
				// Casillas Roma
				Casilla c6 = new Casilla(5, romano6, bayoneta);
				Casilla c7 = new Casilla(6, romano7, galonGas);
				Casilla c8 = new Casilla(7, romano8, daga);
				Casilla c9 = new Casilla(8, romano9, medioCorazon);
				Casilla c10 = new Casilla(9, julioCesar, estatuaMarte);
				
				// Casillas Edad Media
				Casilla c11 = new Casilla(10, caballero11, ballesta);
				Casilla c12 = new Casilla(11, caballero12, medioCorazon);
				Casilla c13 = new Casilla(12, caballero13, garrafonGas);
				Casilla c14 = new Casilla(13, caballero14, catapulta);
				Casilla c15 = new Casilla(14, vlady, espadaEnLaPiedra);
				
				// Casillas Nazi
				Casilla c16 = new Casilla(15, nazi16, ak47);
				Casilla c17 = new Casilla(16, nazi17, corazonCompleto);
				Casilla c18 = new Casilla(17, nazi18, litroGas);
				Casilla c19 = new Casilla(18, nazi19, bombaAtomica);
				Casilla c20 = new Casilla(19, hitler, diario);
			
		
		public Ventana(){
				setSize(850,700);
				setTitle("Back to the present");
				setLayout(new GridLayout(1,1));
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				initComponents();
				setVisible(true);
			}
			
			
			// Pantalla de Inicio en donde se escoje partida nueva o cargar
			public void initComponents(){
				panel1 = new JPanel();
				panel1.setLayout(new FlowLayout());
				lsplash = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Splash.png"));
				panel1.add(lsplash);
				continuarBoton1 = new JButton("Nuevo Juego");
				loadBoton = new JButton("Partida Guardada");
				continuarBoton1.addActionListener(new AvanzarCasillaListener());
				botonGuardar = new JButton("Guardar");
				
				
				panel1.add(continuarBoton1);
				panel1.add(loadBoton);
				add(panel1);
				
				// Ponemos las casillas en el mapa
				map.addCasilla(c1, c1.getIndex());
				map.addCasilla(c2, c2.getIndex());
				map.addCasilla(c3, c3.getIndex());
				map.addCasilla(c4, c4.getIndex());
				map.addCasilla(c5, c5.getIndex());
				map.addCasilla(c6, c6.getIndex());
				map.addCasilla(c7, c7.getIndex());
				map.addCasilla(c8, c8.getIndex());
				map.addCasilla(c9, c9.getIndex());
				map.addCasilla(c10, c10.getIndex());
				map.addCasilla(c11, c11.getIndex());
				map.addCasilla(c12, c12.getIndex());					

				map.addCasilla(c13, c13.getIndex());
				map.addCasilla(c14, c14.getIndex());
				map.addCasilla(c15, c15.getIndex());
				map.addCasilla(c16, c16.getIndex());
				map.addCasilla(c17, c17.getIndex());
				map.addCasilla(c18, c18.getIndex());
				map.addCasilla(c19, c19.getIndex());
				map.addCasilla(c20, c20.getIndex());
					
				map.getInventario().addObjeto(espada, 0);
				map.getInventario().addObjeto(medioCorazon, 1);	
				map.getInventario().addObjeto(litroGas, 2);	
				map.getInventario().addObjeto(null, 3);	
				map.getInventario().addObjeto(null, 4);	
				map.getInventario().addObjeto(null, 5);	
				map.getInventario().addObjeto(ballesta, 6);	
				map.getInventario().addObjeto(null, 7);	
				map.getInventario().addObjeto(null, 8);	
				map.getInventario().addObjeto(null, 9);	
				map.getInventario().addObjeto(null, 10);	
				map.getInventario().addObjeto(null, 11);	
				map.getInventario().addObjeto(null, 12);	
				map.getInventario().addObjeto(null, 13);
				map.getInventario().addObjeto(null, 14);
			}
			
			
			
			// El action Listener de todo 
	public class AvanzarCasillaListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			Object src = e.getSource();
				if (src == continuarBoton1){
					remove(panel1);
					panel2= new JPanel();
					panel2.setLayout(new FlowLayout());
					
					// Aqui debe de haber un try y catch por si no escribe nada
					
					lnombre = new JLabel("Ingrese su nombre: ");
					tnombre= new JTextField(10);
					
					continuarBoton2= new JButton("Continuar");
					continuarBoton2.addActionListener(new AvanzarCasillaListener());
					panel2.add(lnombre);
					panel2.add(tnombre);
					panel2.add(continuarBoton2);
					
					add(panel2);
					revalidate();
					repaint();
						
				} else if (src == continuarBoton2){
					remove(panel2);
					panel3 = new JPanel();
					panel3.setLayout(new FlowLayout());
					
					ldocmar = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/bttfmartydoc.png"));
					lhistoria = new JLabel("<html><br><br>Hola "+tnombre.getText()+", soy el Doctor Black. <br><br>Lamento decirte que por estar jugando con la maquina del tiempo, has viajado accidentalmente <br>al pasado, hasta el anio 3150 a.C. Vas a tener que escoger un vehiculo para tu travesia, escoge <br>bien porque cada uno tiene sus fortalezas y debilidades; una vez que escojas, no podras cambiarlo. <br>Te encontraras con muchos enemigos a lo largo del viaje los cuales trataran de eliminarte, la unica <br>forma en la que puedes regresar a la actualidad es mantenerte con vida y seguir avanzando en las <br>distintas epocas de la historia, trata de usar los objetos que encuentres para ayudarte en tu objetivo. <br>Habra dos formas en las que puedes perder; una es que te quedes sin gasolina, con lo cual no moriras, <br>pero te quedaras atrapado en esa epoca; la otra es que simplemente te quedes sin vida y mueras. <br><br>Mucha suerte en tu viaje.</html>");
					continuarBoton3 = new JButton("Continuar");
					continuarBoton3.addActionListener(new AvanzarCasillaListener());
								
					panel3.add(ldocmar);
					panel3.add(lhistoria);
					panel3.add(continuarBoton3);
					
					
					add(panel3);
					revalidate();
					repaint();
					
						
				} else if(src == continuarBoton3){
					remove(panel3);
					
					panel4 = new JPanel();
					panel4.setLayout(new FlowLayout());
					
					lpersonajesimg = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Personajes.png"));
					
					
					
					lpersonajestext = new JLabel("Escoja su personaje (Introduzca el numero de la opcion): ");
					tpersonaje = new JTextField(5);
					
					lerror = new JLabel("");
					
					continuarBoton4 = new JButton("Continuar");
					continuarBoton4.addActionListener(new AvanzarCasillaListener());
					
					panel4.add(lpersonajesimg);
					panel4.add(lpersonajestext);
					panel4.add(tpersonaje);
					panel4.add(continuarBoton4);
					panel4.add(lerror);
					
					add(panel4);
					revalidate();
					repaint();
					
				} else if (src == continuarBoton4) {
					remove(panel4);
					
					panel5 = new JPanel();
					panel5.setLayout(new FlowLayout());
					
					boolean checar = false;
					
					lerror.setText("");
					try{
						int varerror = Integer.parseInt(tpersonaje.getText());
						switch (Integer.parseInt(tpersonaje.getText())) {
							case 1:
								h = new Moto(tnombre.getText(), 0, 0, 0, 50, 100, 50, espada);
								break;
							case 2:
								h = new Carro(tnombre.getText(), 0, 0, 0, 67, 66, 67, espada);
								break;
							case 3:
								h = new Camioneta(tnombre.getText(), 0, 0, 0, 100, 25, 75, espada);
								break;
							default:
								break;
							}
							if (varerror > 3 || varerror < 1) {
								throw new NumeroNoValido();	
						}
					}
					catch(NumberFormatException ex){
						lerror.setText("Error: escribe un numero");
						checar = true;
						remove(panel5);
						add(panel4);
						revalidate();
						repaint();
					}catch (NumeroNoValido ex) {
						lerror.setText(ex.getMessage());
						checar = true;
						remove(panel5);
						add(panel4);
						revalidate();
						repaint();
					}
					
					
					
					if (checar == false) {
						ltravel = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Travel.jpg"));
						continuarBoton5 = new JButton("Continuar");
						continuarBoton5.addActionListener(new AvanzarCasillaListener());
						
						panel5.add(ltravel);
						panel5.add(continuarBoton5);
						
						add(panel5);
						revalidate();
						repaint();
					}		

					
				} else if (src == continuarBoton5) {
					h.avanzar(h.getPosX());
					remove(panel5);
					
					panel6 = new JPanel();
					panel6.setLayout(new FlowLayout());
					
					lcasilla1 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Egipto/Egipto-1.png"));
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");
					stats.setPreferredSize(new Dimension(500, 70));
					avanzar1 = new JButton("Avanzar");
					avanzar1.addActionListener(new AvanzarCasillaListener());
					
					panel6.add(lcasilla1);
					panel6.add(stats);
					panel6.add(botonGuardar);
					panel6.add(avanzar1);
					
				if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
					for(int j=0; j< map.getInventario().getObjetos().length; j++){
						if(map.getInventario().getObjetos()[j]== null){
						flag= j;
						}
					}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);						
					initComponents2();
				} else if (map.getCasillas()[i].getEnemigo()!=null){
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					initComponents2();
				} else if (map.getCasillas()[i].getObjeto()!=null){
					 flag=0;
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
				}
					i++;
					
					add(panel6);
					revalidate();
					repaint();
				} else if (src == avanzar1) {
					h.avanzar(h.getPosX());
					remove(panel6);
					
					panel7 = new JPanel();
					panel7.setLayout(new FlowLayout());
					
					lcasilla2 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Egipto/Egipto-2.png"));
					avanzar2 = new JButton("Avanzar");
					avanzar2.addActionListener(new AvanzarCasillaListener());
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");
					
					panel7.add(lcasilla2);
					panel7.add(stats);
					panel7.add(botonGuardar);
					panel7.add(avanzar2);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel7);
					revalidate();
					repaint();
				} else if (src == avanzar2) {
					h.avanzar(h.getPosX());
					remove(panel7);
					
					panel8 = new JPanel();
					panel8.setLayout(new FlowLayout());
					
					lcasilla3 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Egipto/Egipto-3.png"));
					avanzar3 = new JButton("Avanzar");
					avanzar3.addActionListener(new AvanzarCasillaListener());
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");
					
					panel8.add(lcasilla3);
					panel8.add(stats);
					panel8.add(botonGuardar);
					panel8.add(avanzar3);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel8);
					revalidate();
					repaint();
				} else if (src == avanzar3) {
					h.avanzar(h.getPosX());
					remove(panel8);
					panel9 = new JPanel();
					panel9.setLayout(new FlowLayout());
					lcasilla4 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Egipto/Egipto-4.png"));
					avanzar4 = new JButton("Avanzar");
					avanzar4.addActionListener(new AvanzarCasillaListener());
					panel9.add(lcasilla4);
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");
					panel9.add(stats);
					panel9.add(botonGuardar);
					panel9.add(avanzar4);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel9);
					revalidate();
					repaint();
				} else if (src == avanzar4) {
					h.avanzar(h.getPosX());
					remove(panel9);
					
					panel10 = new JPanel();
					panel10.setLayout(new FlowLayout());
					
					lcasilla5 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Egipto/Akenaton.png"));
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					avanzar5 = new JButton("Avanzar");
					avanzar5.addActionListener(new AvanzarCasillaListener());
					
					panel10.add(lcasilla5);
					panel10.add(stats);
					panel10.add(botonGuardar);
					panel10.add(avanzar5);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel10);
					revalidate();
					repaint();
				} else if (src == avanzar5) {
					h.avanzar(h.getPosX());
					remove(panel10);
					
					panel11 = new JPanel();
					panel11.setLayout(new FlowLayout());
					
					lcasilla6 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Roma/Roma-1.png"));
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					avanzar6 = new JButton("Avanzar");
					avanzar6.addActionListener(new AvanzarCasillaListener());
					
					panel11.add(lcasilla6);
					panel11.add(stats);
					panel11.add(botonGuardar);
					panel11.add(avanzar6);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel11);
					revalidate();
					repaint();
				} else if (src == avanzar6) {
					h.avanzar(h.getPosX());
					remove(panel11);
					
					panel12 = new JPanel();
					panel12.setLayout(new FlowLayout());
					
					lcasilla7 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Roma/Roma-2.png"));
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					avanzar7 = new JButton("Avanzar");
					avanzar7.addActionListener(new AvanzarCasillaListener());
					
					panel12.add(lcasilla7);
					panel12.add(stats);
					panel12.add(botonGuardar);
					panel12.add(avanzar7);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel12);
					revalidate();
					repaint();
				} else if (src == avanzar7) {
					h.avanzar(h.getPosX());
					remove(panel12);
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					panel13 = new JPanel();
					panel13.setLayout(new FlowLayout());
					
					lcasilla8 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Roma/Roma-3.png"));
					avanzar8 = new JButton("Avanzar");
					avanzar8.addActionListener(new AvanzarCasillaListener());
					
					panel13.add(lcasilla8);
					panel13.add(stats);
					panel13.add(botonGuardar);
					panel13.add(avanzar8);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel13);
					revalidate();
					repaint();
				} else if (src == avanzar8) {
					h.avanzar(h.getPosX());
					remove(panel13);
					
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					
					panel14 = new JPanel();
					panel14.setLayout(new FlowLayout());
					
					lcasilla9 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Roma/Roma-4.png"));
					avanzar9 = new JButton("Avanzar");
					avanzar9.addActionListener(new AvanzarCasillaListener());
					
					panel14.add(lcasilla9);
					panel14.add(stats);
					panel14.add(botonGuardar);
					panel14.add(avanzar9);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel14);
					revalidate();
					repaint();
				} else if (src == avanzar9) {
					h.avanzar(h.getPosX());
					remove(panel14);
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					panel15 = new JPanel();
					panel15.setLayout(new FlowLayout());
					
					lcasilla10 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Roma/Neron.png"));
					avanzar10 = new JButton("Avanzar");
					avanzar10.addActionListener(new AvanzarCasillaListener());
					
					panel15.add(lcasilla10);
					panel15.add(stats);
					panel15.add(botonGuardar);
					panel15.add(avanzar10);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel15);
					revalidate();
					repaint();
				} else if (src == avanzar10) {
					h.avanzar(h.getPosX());
					remove(panel15);
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					panel16 = new JPanel();
					panel16.setLayout(new FlowLayout());
					lcasilla11 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Dracula/Dracula-1.png"));
					avanzar11 = new JButton("Avanzar");
					avanzar11.addActionListener(new AvanzarCasillaListener());
					
					panel16.add(lcasilla11);
					panel16.add(stats);
					panel16.add(botonGuardar);
					panel16.add(avanzar11);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel16);
					revalidate();
					repaint();
				} else if (src == avanzar11) {
					h.avanzar(h.getPosX());
					remove(panel16);
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					panel17 = new JPanel();
					panel17.setLayout(new FlowLayout());
					
					lcasilla12 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Dracula/Dracula-2.png"));
					avanzar12 = new JButton("Avanzar");
					avanzar12.addActionListener(new AvanzarCasillaListener() );
					
					panel17.add(lcasilla12);
					panel17.add(stats);
					panel17.add(botonGuardar);
					panel17.add(avanzar12);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel17);
					revalidate();
					repaint();
				} else if (src == avanzar12) {
					h.avanzar(h.getPosX());
					remove(panel17);
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					panel18 = new JPanel();
					panel18.setLayout(new FlowLayout());
					
					lcasilla13 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Dracula/Dracula-3.png"));
					avanzar13 = new JButton("Avanzar");
					avanzar13.addActionListener(new AvanzarCasillaListener());
					
					panel18.add(lcasilla13);
					panel18.add(stats);
					panel18.add(botonGuardar);
					panel18.add(avanzar13);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel18);
					revalidate();
					repaint();
				} else if (src == avanzar13) {
					h.avanzar(h.getPosX());
					remove(panel18);
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					panel19 = new JPanel();
					panel19.setLayout(new FlowLayout());
					
					lcasilla14 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Dracula/Dracula-4.png"));
					avanzar14 = new JButton("Avanzar");
					avanzar14.addActionListener(new AvanzarCasillaListener());
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					panel19.add(lcasilla14);
					panel19.add(stats);
					panel19.add(botonGuardar);
					panel19.add(avanzar14);
					
					add(panel19);
					revalidate();
					repaint();
				} else if (src == avanzar14) {
					h.avanzar(h.getPosX());
					remove(panel19);
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					panel20 = new JPanel();
					panel20.setLayout(new FlowLayout());
					
					lcasilla15 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Dracula/Vladi.png"));
					avanzar15 = new JButton("Avanzar");
					avanzar15.addActionListener(new AvanzarCasillaListener());
					
					panel20.add(lcasilla15);
					panel20.add(stats);
					panel20.add(botonGuardar);
					panel20.add(avanzar15);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel20);
					revalidate();
					repaint();
				} else if (src == avanzar15) {
					h.avanzar(h.getPosX());
					remove(panel20);
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					panel21 = new JPanel();
					panel21.setLayout(new FlowLayout());
					
					lcasilla16 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Nazi/Nazi-1.png"));
					avanzar16 = new JButton("Avanzar");
					avanzar16.addActionListener(new AvanzarCasillaListener());
					
					panel21.add(lcasilla16);
					panel21.add(stats);
					panel21.add(avanzar16);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel21);
					revalidate();
					repaint();
				} else if (src == avanzar16) {
					h.avanzar(h.getPosX());
					remove(panel21);
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					panel22 = new JPanel();
					panel22.setLayout(new FlowLayout());
					
					lcasilla17 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Nazi/Nazi-2.png"));
					avanzar17 = new JButton("Avanzar");
					avanzar17.addActionListener(new AvanzarCasillaListener());
					
					panel22.add(lcasilla17);
					panel22.add(stats);
					panel22.add(avanzar17);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel22);
					revalidate();
					repaint();
				} else if (src == avanzar17) {
					h.avanzar(h.getPosX());
					remove(panel22);
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					panel23 = new JPanel();
					panel23.setLayout(new FlowLayout());
					
					lcasilla18 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Nazi/Nazi-3.png"));
					avanzar18 = new JButton("Avanzar");
					avanzar18.addActionListener(new AvanzarCasillaListener() );
					
					panel23.add(lcasilla18);
					panel23.add(stats);
					panel23.add(avanzar18);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel23);
					revalidate();
					repaint();
				} else if (src == avanzar18) {
					h.avanzar(h.getPosX());
					remove(panel23);
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					panel24 = new JPanel();
					panel24.setLayout(new FlowLayout());
					
					lcasilla19 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Nazi/Nazi-4.png"));
					avanzar19 = new JButton("Avanzar");
					avanzar19.addActionListener(new AvanzarCasillaListener() );
					
					panel24.add(lcasilla19);
					panel24.add(stats);
					panel24.add(avanzar19);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
					i++;
					
					add(panel24);
					revalidate();
					repaint();
					
				} else if (src == avanzar19) {
					h.avanzar(h.getPosX());
					remove(panel24);
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");

					panel25 = new JPanel();
					panel25.setLayout(new FlowLayout());
					
					lcasilla20 = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/img/Nazi/Hilter.png"));
					avanzar20 = new JButton("Avanzar");
					avanzar20.addActionListener(new AvanzarCasillaListener() );
					
					panel25.add(lcasilla20);
					panel25.add(stats);
					panel25.add(avanzar20);
					
					if ((map.getCasillas()[i].getEnemigo()!=null)&&(map.getCasillas()[i].getObjeto()!=null)) {
					flag=0;
					JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
					JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						
						for(int j=0; j< map.getInventario().getObjetos().length; j++){
							if(map.getInventario().getObjetos()[j]== null){
							flag= j;
							}
						}
					map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
					initComponents2();
					} else if (map.getCasillas()[i].getEnemigo()!=null){
						JOptionPane.showMessageDialog(null, "Te ha aparacido un "+map.getCasillas()[i].getEnemigo().getNombre(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
						initComponents2();
					} else if (map.getCasillas()[i].getObjeto()!=null){
						flag=0;
						JOptionPane.showMessageDialog(null, "Te has encontrado un "+map.getCasillas()[i].getObjeto().getDescripcion(), "Sorpresa", JOptionPane.INFORMATION_MESSAGE);
							for(int j=0; j< map.getInventario().getObjetos().length; j++){
								if(map.getInventario().getObjetos()[j]== null){
								flag= j;
								}
							}
						map.getInventario().addObjeto(map.getCasillas()[i].getObjeto(), flag);					
						initComponents2();
					}
				
					
					add(panel25);
					revalidate();
					repaint();
				
				} else if (src == avanzar20) {
					h.avanzar(h.getPosX());
					remove(panel25);
					stats = new JLabel("<html>Stats del jugador<br>Vida  "+h.getSalud()+"<br>Gasolina  "+h.getGas()+"<br>XP  "+h.getXp()+"<br>Nivel  "+h.getNivel()+"</html>");
		
					panel26 = new JPanel();
					panel26.setLayout(new FlowLayout());
									
					lcasilla21 = new JLabel("Felicidades por terminar el juego");
														
					panel26.add(lcasilla21);
														
					add(panel26);
					revalidate();
					repaint();
								}
				
			}
		}		
	// Peleas con enemigos 
		
		// Las cosas necesarias para crear la ventana
		 private JFrame frame;
		    private JPanel panelSuperiorIzquierdo, panelInferiorIzquierdo, panelSuperiorDerecho, panelInferiorDerecho, panelInferiorIzquierdo2, panelInferiorIzquierdo3, panelInferiorIzquierdo4, panelInferiorIzquierdo5, panelInferiorIzquierdo6;
		    private JButton AtaqueArma, AtaqueSinArma, AtaqueEspecial, Huir, Inventario, Elegir;
			private JTextField tinventario;
			private JLabel jinicio, jespecial1, jespecial2, jespecial3, jnormal1, jnormal2, jarma1, jarma2, jarma3, jinventario, jusar, limagen;
			
		//Se crea el JFrame
			public void initComponents2(){
		        PanelSuperiorIzquierdo();
		        PanelInferiorIzquierdo();
				PanelSuperiorDerecho();
		        PanelInferiorDerecho();
		        VentanaPelea();
		}
		
			public void VentanaPelea(){
		        frame =new JFrame("Pelea!");
				frame.setSize(800, 400);
		        frame.setLayout(new GridLayout(2,2));
		        frame.add(panelSuperiorIzquierdo);
				frame.add(panelSuperiorDerecho);
		        frame.add(panelInferiorIzquierdo);
		        frame.add(panelInferiorDerecho);
		        frame.setVisible(true);
		        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
			}

		    public void PanelSuperiorIzquierdo(){
		        panelSuperiorIzquierdo = new JPanel ();
				//panelSuperiorIzquierdo.setBackground(Color.black);
				panelSuperiorIzquierdo.setBackground(new Color(10,27,73));
				panelSuperiorIzquierdo.setLayout(new FlowLayout());
				limagen = new JLabel(new ImageIcon("/Users/reach/Desktop/Java Programs/2do semestre/RPGv5/Batallas/batalla-sombra.png"));
				panelSuperiorIzquierdo.add(limagen);
		        }
				
				
				//	lcasilla12 = new JLabel(new ImageIcon("/Users/Anzgal/Documents/Objetos/RPG/img/Dracula/Dracula-2.png"));
				
		    public void PanelInferiorIzquierdo(){
				panelInferiorIzquierdo = new JPanel ();
				panelInferiorIzquierdo.setBackground(new Color(10,27,73));
				panelInferiorIzquierdo.setLayout(new FlowLayout());
				jinicio=new JLabel();
				jinicio.setForeground(Color.white);
				jinicio.setText("Que desea hacer: ?");
				panelInferiorIzquierdo.add(jinicio);
		        }
				
			public void PanelInferiorIzquierdo2(){
				panelInferiorIzquierdo2 = new JPanel ();
				panelInferiorIzquierdo2.setBackground(new Color(10,27,73));
				panelInferiorIzquierdo2.setLayout(new FlowLayout());
				jespecial1=new JLabel();
				jespecial1.setForeground(Color.white);
				jespecial1.setText("    El enemigo ha recibido "+h.getAtaque()+" danio    ");
				panelInferiorIzquierdo2.add(jespecial1);
				jespecial2=new JLabel();
				jespecial2.setForeground(Color.white);
				jespecial2.setText("    El enemigo le queda "+map.getCasillas()[i].getEnemigo().getVida()+" vida     ");
				panelInferiorIzquierdo2.add(jespecial2);
				jespecial3=new JLabel();
				jespecial3.setForeground(Color.white);
				jespecial3.setText("    Te queda "+h.getGas()+" gasolina    ");
				panelInferiorIzquierdo2.add(jespecial3);
			}
			// Cuando sea hace un ataque sin arma
			public void PanelInferiorIzquierdo3(){
				panelInferiorIzquierdo3 = new JPanel ();
				panelInferiorIzquierdo3.setBackground(new Color(10,27,73));
				panelInferiorIzquierdo3.setLayout(new FlowLayout());
				jnormal1=new JLabel();
				jnormal1.setForeground(Color.white);
				jnormal1.setText("     El enemigo ha recibido "+h.getAtaque()+" danio     ");
				panelInferiorIzquierdo3.add(jnormal1);
				jnormal2=new JLabel();
				jnormal2.setForeground(Color.white);
				jnormal2.setText("    El enemigo le queda "+map.getCasillas()[i].getEnemigo().getVida()+" vida     ");
				panelInferiorIzquierdo3.add(jnormal2);
			}
		        // Cuando sea hace un ataque CON arma
			public void PanelInferiorIzquierdo4(){
				panelInferiorIzquierdo4 = new JPanel ();
				panelInferiorIzquierdo4.setBackground(new Color(10,27,73));
				panelInferiorIzquierdo4.setLayout(new FlowLayout());
				jarma1=new JLabel();
				jarma1.setForeground(Color.white);
				jarma1.setText("    Has usado el arma: "+h.getObjeto().getDescripcion()+"    ");
				h.atacar(h.getAtaque(), espada, momia1);
				panelInferiorIzquierdo4.add(jarma1);
				jarma2=new JLabel();
				jarma2.setForeground(Color.white);
				jarma2.setText(" 	 El enemigo ha recibido "+h.getAtaque()+" danio               ");
				panelInferiorIzquierdo4.add(jarma2);
				jarma3=new JLabel();
				jarma3.setForeground(Color.white);
				jarma3.setText("    El enemigo le queda "+map.getCasillas()[i].getEnemigo().getVida()+" vida     ");
				panelInferiorIzquierdo4.add(jarma3);
			}
			
			public void PanelInferiorIzquierdo5(){
				panelInferiorIzquierdo5 = new JPanel ();
				panelInferiorIzquierdo5.setBackground(new Color(10,27,73));
				panelInferiorIzquierdo5.setLayout(new FlowLayout());
				jusar=new JLabel();
				jusar.setForeground(Color.white);
				jusar.setText("    Que objeto deseas utilizar (numero): ?    ");
				panelInferiorIzquierdo5.add(jusar);
				tinventario = new JTextField(3);
		        panelInferiorIzquierdo5.add(tinventario);
				Elegir=new JButton("Usar");
				Elegir.addActionListener(new MiListener());
				panelInferiorIzquierdo5.add(Elegir);
				
			}
				
			public void PanelInferiorDerecho(){
		        panelInferiorDerecho = new JPanel ();
				panelInferiorDerecho.setBackground(new Color(10,27,73));
				panelInferiorDerecho.setLayout(new GridLayout(2,2));
				AtaqueEspecial=new JButton("Ataque Especial");
				AtaqueEspecial.addActionListener(new MiListener());
				panelInferiorDerecho.add(AtaqueEspecial);
				AtaqueArma=new JButton("Ataque Arma");
				AtaqueArma.addActionListener(new MiListener());
				panelInferiorDerecho.add(AtaqueArma);
				AtaqueSinArma=new JButton("Ataque sin Arma");
				AtaqueSinArma.addActionListener(new MiListener());
				panelInferiorDerecho.add(AtaqueSinArma);
				Huir=new JButton("Huir");
				Huir.addActionListener(new MiListener());
				panelInferiorDerecho.add(Huir);
				Inventario=new JButton("Inventario");
				Inventario.addActionListener(new MiListener());
				panelInferiorDerecho.add(Inventario);
		        }
				
			public void PanelSuperiorDerecho(){
		        panelSuperiorDerecho = new JPanel ();
				panelSuperiorDerecho.setBackground(new Color(10,27,73));
				panelSuperiorDerecho.setLayout(new FlowLayout());
				jinventario1=new JLabel();
				jinventario1.setForeground(Color.white);
				jinventario2=new JLabel();
				jinventario2.setForeground(Color.white);
				jinventario3=new JLabel();
				jinventario3.setForeground(Color.white);
				jinventario4=new JLabel();
				jinventario4.setForeground(Color.white);
				jinventario5=new JLabel();
				jinventario5.setForeground(Color.white);
				jinventario6=new JLabel();
				jinventario6.setForeground(Color.white);
				imprimeInventario();
				panelSuperiorDerecho.add(jinventario1);
				panelSuperiorDerecho.add(jinventario2);
				panelSuperiorDerecho.add(jinventario3);
				panelSuperiorDerecho.add(jinventario4);
				panelSuperiorDerecho.add(jinventario5);
				panelSuperiorDerecho.add(jinventario6);
				}
				
			public class MiListener implements ActionListener{
				public void actionPerformed(ActionEvent e){
					Object src = e.getSource();
					if (src == AtaqueArma){
						
						h.atacar(h.getAtaque(), h.getObjeto(), map.getCasillas()[i].getEnemigo());
						
						frame.setVisible(false);
							PanelSuperiorIzquierdo();
							PanelInferiorIzquierdo4();
							PanelSuperiorDerecho();
							PanelInferiorDerecho();
							VentanaPelea();
							frame.add(panelSuperiorIzquierdo);
							frame.add(panelSuperiorDerecho);
							frame.remove(panelInferiorIzquierdo);
							frame.add(panelInferiorIzquierdo4);
							frame.add(panelInferiorDerecho);
							frame.revalidate();
							frame.repaint();
						
							if (h.getSalud()>0 && map.getCasillas()[i].getEnemigo().getVida()>0) {
							
								map.getCasillas()[i].getEnemigo().atacar(map.getCasillas()[i].getEnemigo().getAtaque(), h);
								JOptionPane.showMessageDialog(null, "El enemigo te ha causado "+map.getCasillas()[i].getEnemigo().getAtaque()+" puntos de danio\nTe quedan "+h.getSalud()+" puntos de vida", "Turno del enemigo",JOptionPane.INFORMATION_MESSAGE);
							
									if (map.getCasillas()[i].getEnemigo().getVida()>0 && h.getSalud()<=0){
										JOptionPane.showMessageDialog(null, "Has perdido la batalla   Te has quedado sin vida  Fin del juego", "Con un demonio lo que faltaba",JOptionPane.INFORMATION_MESSAGE);
										System.exit(0);
									} 
								
							} else if (map.getCasillas()[i].getEnemigo().getVida()<=0 && h.getSalud()>0) {
						
								JOptionPane.showMessageDialog(null, "Has ganado la batalla   Recibes "+map.getCasillas()[i].getEnemigo().getXpReward()+"xp", "Uffa Kalufa",JOptionPane.INFORMATION_MESSAGE);
								h.addXp(h.getXp(), map.getCasillas()[i].getEnemigo());
						
									if (h.getXp()>=30 && h.getNivel()==0) {
										h.subirNivel(h.getNivel());
									
										JOptionPane.showMessageDialog(null, "Alcanzaste el nivel "+h.getNivel(), " Felicidades",JOptionPane.INFORMATION_MESSAGE);
									}else if (h.getXp()>= 150 && h.getNivel()==1){
										h.subirNivel(h.getNivel());
									
										JOptionPane.showMessageDialog(null, "Alcanzaste el nivel "+h.getNivel(), " Felicidades",JOptionPane.INFORMATION_MESSAGE);
									}else if (h.getXp()>= 300 && h.getNivel()==2){
										h.subirNivel(h.getNivel());
									
										JOptionPane.showMessageDialog(null, "Alcanzaste el nivel máximo de "+h.getNivel(), " Felicidades",JOptionPane.INFORMATION_MESSAGE);
									}
								frame.setVisible(false);
						
							}
				
					} else if (src == AtaqueEspecial){
						
					if (h.getGas()>Heroe.usoGas){
						
						h.atacar(h.getAtaque(), h.getGas(), map.getCasillas()[i].getEnemigo());
						
						frame.setVisible(false);
							PanelSuperiorIzquierdo();
							PanelInferiorIzquierdo2();
							PanelSuperiorDerecho();
							PanelInferiorDerecho();
							VentanaPelea();
							frame.add(panelSuperiorIzquierdo);
							frame.add(panelSuperiorDerecho);
							frame.remove(panelInferiorIzquierdo);
							frame.add(panelInferiorIzquierdo2);
							frame.add(panelInferiorDerecho);
							frame.revalidate();
							frame.repaint();
						
						if (h.getSalud()>0 && map.getCasillas()[i].getEnemigo().getVida()>0) {
							
							map.getCasillas()[i].getEnemigo().atacar(map.getCasillas()[i].getEnemigo().getAtaque(), h);
							JOptionPane.showMessageDialog(null, "El enemigo te ha causado "+map.getCasillas()[i].getEnemigo().getAtaque()+" puntos de danio\nTe quedan "+h.getSalud()+" puntos de vida", "Turno del enemigo",JOptionPane.INFORMATION_MESSAGE);
							
								if (map.getCasillas()[i].getEnemigo().getVida()>0 && h.getSalud()<=0){
									JOptionPane.showMessageDialog(null, "Has perdido la batalla   Te has quedado sin vida  Fin del juego", "Con un demonio lo que faltaba",JOptionPane.INFORMATION_MESSAGE);
									System.exit(0);
								}			
								
						} else if (map.getCasillas()[i].getEnemigo().getVida()<=0 && h.getSalud()>0) {
						
							JOptionPane.showMessageDialog(null, "Has ganado la batalla   Recibes "+map.getCasillas()[i].getEnemigo().getXpReward()+"xp", "Uffa Kalufa",JOptionPane.INFORMATION_MESSAGE);
							h.addXp(h.getXp(), map.getCasillas()[i].getEnemigo());
						
								if (h.getXp()>=30 && h.getNivel()==0) {
										h.subirNivel(h.getNivel());
									
										JOptionPane.showMessageDialog(null, "Alcanzaste el nivel "+h.getNivel(), " Felicidades",JOptionPane.INFORMATION_MESSAGE);
									}else if (h.getXp()>= 150 && h.getNivel()==1){
										h.subirNivel(h.getNivel());
									
										JOptionPane.showMessageDialog(null, "Alcanzaste el nivel "+h.getNivel(), " Felicidades",JOptionPane.INFORMATION_MESSAGE);
									}else if (h.getXp()>= 300 && h.getNivel()==2){
										h.subirNivel(h.getNivel());
									
										JOptionPane.showMessageDialog(null, "Alcanzaste el nivel máximo de "+h.getNivel(), " Felicidades",JOptionPane.INFORMATION_MESSAGE);
									}
							frame.setVisible(false);
						
						}
					} else {
						JOptionPane.showMessageDialog(null, "No puedes usar este ataque debido a que no ya no te queda gasolina", "Muere cobarde", JOptionPane.INFORMATION_MESSAGE);

					}
												
						
					} else if(src== AtaqueSinArma){
						
						h.atacar(h.getAtaque(), map.getCasillas()[i].getEnemigo());
						
						frame.setVisible(false);
							PanelSuperiorIzquierdo();
							PanelInferiorIzquierdo3();
							PanelSuperiorDerecho();
							PanelInferiorDerecho();
							VentanaPelea();
							frame.add(panelSuperiorIzquierdo);
							frame.add(panelSuperiorDerecho);
							frame.remove(panelInferiorIzquierdo);
							frame.add(panelInferiorIzquierdo3);
							frame.add(panelInferiorDerecho);
							frame.revalidate();
							frame.repaint();
						
						if (h.getSalud()>0 && map.getCasillas()[i].getEnemigo().getVida()>0) {
							
							map.getCasillas()[i].getEnemigo().atacar(map.getCasillas()[i].getEnemigo().getAtaque(), h);
							JOptionPane.showMessageDialog(null, "El enemigo te ha causado "+map.getCasillas()[i].getEnemigo().getAtaque()+" puntos de danio\nTe quedan "+h.getSalud()+" puntos de vida", "Turno del enemigo",JOptionPane.INFORMATION_MESSAGE);
							
								if (map.getCasillas()[i].getEnemigo().getVida()>0 && h.getSalud()<=0){
									JOptionPane.showMessageDialog(null, "Has perdido la batalla   Te has quedado sin vida  Fin del juego", "Con un demonio lo que faltaba",JOptionPane.INFORMATION_MESSAGE);
									System.exit(0);
								}			
								
						} else if (map.getCasillas()[i].getEnemigo().getVida()<=0 && h.getSalud()>0) {
						
							JOptionPane.showMessageDialog(null, "Has ganado la batalla   Recibes "+map.getCasillas()[i].getEnemigo().getXpReward()+"xp", "Uffa Kalufa",JOptionPane.INFORMATION_MESSAGE);
							h.addXp(h.getXp(), map.getCasillas()[i].getEnemigo());
						
								if (h.getXp()>=30 && h.getNivel()==0) {
										h.subirNivel(h.getNivel());
									
										JOptionPane.showMessageDialog(null, "Alcanzaste el nivel "+h.getNivel(), " Felicidades",JOptionPane.INFORMATION_MESSAGE);
									}else if (h.getXp()>= 150 && h.getNivel()==1){
										h.subirNivel(h.getNivel());
									
										JOptionPane.showMessageDialog(null, "Alcanzaste el nivel "+h.getNivel(), " Felicidades",JOptionPane.INFORMATION_MESSAGE);
									}else if (h.getXp()>= 300 && h.getNivel()==2){
										h.subirNivel(h.getNivel());
									
										JOptionPane.showMessageDialog(null, "Alcanzaste el nivel máximo de "+h.getNivel(), " Felicidades",JOptionPane.INFORMATION_MESSAGE);
									}
							frame.setVisible(false);
						
						}
												
					}else if(src== Huir){
						
						if(h.getGas()>Heroe.usoGas){
							
							h.huir(h.getGas());
							JOptionPane.showMessageDialog(null, "Abandonas la batalla  Pierdes "+Heroe.usoGas+" gasolina   Te queda "+h.getGas()+" gasolina", "Has huido", JOptionPane.INFORMATION_MESSAGE);
							frame.setVisible(false);
						} else {
							JOptionPane.showMessageDialog(null, "No puedes abandonar la batalla debido a que no ya no te queda gasolina", "Muere cobarde", JOptionPane.INFORMATION_MESSAGE);

						}
						
					} else if(src== Inventario){
						
						frame.setVisible(false);
						PanelSuperiorIzquierdo();
						PanelInferiorIzquierdo5();
						PanelSuperiorDerecho();
						PanelInferiorDerecho();
						VentanaPelea();
						frame.add(panelSuperiorIzquierdo);
						frame.add(panelSuperiorDerecho);
						frame.remove(panelInferiorIzquierdo);
						frame.add(panelInferiorIzquierdo5);
						frame.add(panelInferiorDerecho);
						frame.revalidate();
						frame.repaint();
						
					} else if (src == Elegir){
						
						int x = Integer.parseInt(tinventario.getText());
						if((map.getInventario().getObjetos()[x].getDescripcion().equals("Medio Corazon (50 HP)"))||(map.getInventario().getObjetos()[x].getDescripcion().equals("Corazon completo (100 HP)"))||(map.getInventario().getObjetos()[x].getDescripcion().equals("Cuarto de Corazon (25 HP)"))){
								h.addSalud(h.getSalud(), map.getInventario().getObjetos()[x]);
								JOptionPane.showMessageDialog(null, "Has usado "+map.getInventario().getObjetos()[x].getDescripcion()+" Tu vida sube "+map.getInventario().getObjetos()[x].getCantidadVida(), "Inventario", JOptionPane.INFORMATION_MESSAGE);
								map.getInventario().getObjetos()[x]= null;
						} else if((map.getInventario().getObjetos()[x].getDescripcion().equals("Litro de Gasolina (25 GAS)"))||(map.getInventario().getObjetos()[x].getDescripcion().equals("Galon de Gasolina (50 GAS)"))||(map.getInventario().getObjetos()[x].getDescripcion().equals("Garrafon de Gasolina (100 GAS)"))){
								h.addGasolina(h.getGas(), map.getInventario().getObjetos()[x]);
								JOptionPane.showMessageDialog(null, "Has usado "+map.getInventario().getObjetos()[x].getDescripcion()+" Tu gasolina sube "+map.getInventario().getObjetos()[x].getCantidadGas(), "Inventario", JOptionPane.INFORMATION_MESSAGE);
								map.getInventario().getObjetos()[x]= null;
						} else if((map.getInventario().getObjetos()[x].getDescripcion().equals("Espada (10 ATK)"))||(map.getInventario().getObjetos()[x].getDescripcion().equals("Arco (11 ATK)"))||(map.getInventario().getObjetos()[x].getDescripcion().equals("Bayoneta (15 ATK)"))||(map.getInventario().getObjetos()[x].getDescripcion().equals("Daga (16 ATK)"))||(map.getInventario().getObjetos()[x].getDescripcion().equals("Ballesta (21 ATK)"))||(map.getInventario().getObjetos()[x].getDescripcion().equals("Catapulta (22 ATK)"))||(map.getInventario().getObjetos()[x].getDescripcion().equals("AK47 (20 ATK)"))||(map.getInventario().getObjetos()[x].getDescripcion().equals("Bomba Atomica (150 ATK)"))){
								h.setObjeto(map.getInventario().getObjetos()[x]);
								JOptionPane.showMessageDialog(null, "Te has equipado con "+h.getObjeto().getDescripcion(), "Inventario", JOptionPane.INFORMATION_MESSAGE);
						}
					
							frame.setVisible(false);
							frame.removeAll();
							PanelSuperiorIzquierdo();
							PanelInferiorIzquierdo();
							PanelSuperiorDerecho();
							PanelInferiorDerecho();
							VentanaPelea();
							frame.add(panelSuperiorIzquierdo);
							frame.add(panelSuperiorDerecho);
							frame.add(panelInferiorIzquierdo);
							frame.add(panelInferiorDerecho);
							frame.revalidate();
							frame.repaint();
					}
					
				}
			}

			
		public void imprimeInventario(){
			String resultado1="";
			String resultado2="";
			String resultado3="";
			String resultado4="";
			String resultado5="";
				for(int i=0;i<3;i++){
					try{
						resultado1=resultado1+"\n"+i+"." +map.getInventario().getObjetos()[i].getDescripcion()+" ";
					}catch(NullPointerException e){
						resultado1=resultado1+"\n"+i+"." +"Vacio"+" ";
					}
				jinventario1.setText(resultado1);
				}
				for(int i=3;i<6;i++){
					try{
						resultado2=resultado2+"\n"+i+"." +map.getInventario().getObjetos()[i].getDescripcion()+" ";
					}catch(NullPointerException e){
						resultado2=resultado2+"\n"+i+"." +"Vacio"+" ";
					}
				jinventario2.setText(resultado2);
				}
				for(int i=6;i<9;i++){
					try{
						resultado3=resultado3+"\n"+i+"." +map.getInventario().getObjetos()[i].getDescripcion()+" ";
					}catch(NullPointerException e){
						resultado3=resultado3+"\n"+i+"." +"Vacio"+" ";
					}
				jinventario3.setText(resultado3);
				}
				for(int i=9;i<12;i++){
					try{
						resultado4=resultado4+"\n"+i+"." +map.getInventario().getObjetos()[i].getDescripcion()+" ";
					}catch(NullPointerException e){
						resultado4=resultado4+"\n"+i+"." +"Vacio"+" ";
					}
				jinventario4.setText(resultado4);
				}
				for(int i=12;i<15;i++){
					try{
						resultado5=resultado5+"\n"+i+"." +map.getInventario().getObjetos()[i].getDescripcion()+" ";
					}catch(NullPointerException e){
						resultado5=resultado5+"\n"+i+"." +"Vacio"+" ";
					}
				jinventario5.setText(resultado5);
				}
				
		}
		
		
	
}