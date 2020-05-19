

const handleOpenModal = (e) => {
    const scoreModal = $('#score-modal');
    const scoreEl = $(e.target);
    const modalInput = $('#score-input');
    const scoreId = scoreEl.attr('data-score-id');
    const studentId = scoreEl.attr('data-student-id');

    // set score and initial value
    modalInput.attr('data-score-id', scoreId);
    modalInput.attr('data-student-id', studentId);
    modalInput.val(scoreEl.text());

    scoreModal.modal('show');
};

const updateScore = async () => {
    const scoreModal = $('#score-modal');
    const modalInput = $('#score-input');
    const scoreId = modalInput.attr('data-score-id');
    const studentId = modalInput.attr('data-student-id');
    const scoreValue = modalInput.val();
    const scoreEl = $(`.score[data-score-id=${scoreId}]`);
    const totalEl = $(`.total[data-student-id=${studentId}]`);

    if(scoreValue < 0 || scoreValue > 100) {
        alert('Score value must be between 0 and 100');
        return;
    }

    // TODO: implement updating
    await new Promise((resolve) => setTimeout(() => resolve(), 1000));

    // update total value
    const scoreDiff = scoreValue - parseInt(scoreEl.text());
    const newTotalScore = parseInt(totalEl.text()) + scoreDiff;

    scoreEl.text(scoreValue);
    totalEl.text(newTotalScore);

    scoreModal.modal('hide');
}


$( document ).ready(() => {
    const scores = $('.score');
    const updateScoreBtn = $('#update-score-btn');

    updateScoreBtn.click(updateScore);
    scores.click(handleOpenModal);
})
