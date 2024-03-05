package ru.arnaliev.school21.info21_v2_java.controllers.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.arnaliev.school21.info21_v2_java.model.Peer;
import ru.arnaliev.school21.info21_v2_java.service.PeerService;

import java.util.Date;
import java.util.List;


@Controller
public class PeersController {
    private final PeerService service;

    @Autowired
    public PeersController(PeerService service) {
        this.service = service;
    }
    @GetMapping("/data")
    public String dataPage() {
        return "data/data";
    }
    @RequestMapping("/data/peers")
    public String getPeers(Model model) {
        List<Peer> peers = service.findAll();
        model.addAttribute("peers", peers);
        return "data/peer/peers";
    }
    @GetMapping("/data/peer/{nickname}")
    public String peerInfo(@PathVariable String nickname, Model model) {
        model.addAttribute("peer", service.findByNickname(nickname));
        return "data/peer/peer";
    }

    @PostMapping("/data/addPeer")
    public String addPeer(Peer peer) {
        service.save(peer);
        return "redirect:/data/peers";
    }

    @PostMapping("/data/delete/{nickname}")
    public String deletePeer(@PathVariable String nickname) {
        service.delete(nickname);
        return "redirect:/data/peers";
    }
}
