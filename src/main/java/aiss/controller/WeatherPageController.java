package aiss.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.resource.OpenWeatherResource;

public class WeatherPageController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(WeatherPageController.class.getName());

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		//OpenWeather
		try {
			String lat = req.getParameter("latitud");
			String lon = req.getParameter("longitud");
			OpenWeatherResource weatherRes = new OpenWeatherResource();
			List<aiss.model.openWeather.List> res = weatherRes.getDatosMeteorolicos(lat, lon);
			LocalDate today = LocalDate.now();
			req.setAttribute("predicciones1", weatherRes.getPrediccionesPorDía(res, today.toString()));
			req.setAttribute("predicciones2", weatherRes.getPrediccionesPorDía(res, today.plusDays(1).toString()));
			req.setAttribute("predicciones3", weatherRes.getPrediccionesPorDía(res, today.plusDays(2).toString()));
			req.setAttribute("predicciones4", weatherRes.getPrediccionesPorDía(res, today.plusDays(3).toString()));
			req.setAttribute("predicciones5", weatherRes.getPrediccionesPorDía(res, today.plusDays(4).toString()));
			
			req.getRequestDispatcher("/weather.jsp").forward(req, resp);
		
		}catch (Exception e){
			log.warning(e.getMessage());
			req.getRequestDispatcher("/error.html").forward(req, resp);
		}
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		doGet(req, resp);
	}
}
